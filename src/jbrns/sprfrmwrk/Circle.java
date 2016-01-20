package jbrns.sprfrmwrk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Controller
public class Circle implements Shape {

    private Point center;
    @Autowired
    private MessageSource messageSource;

    @Override
    public void draw() {
        System.out.println(messageSource.getMessage("drawing.circle", null, "Default Drawing Circle", null));
        System.out.println(this.messageSource.getMessage("drawing.point",
                new Object[] {center.getX(), center.getY()}, "Default Point Message", null));
    }

    public MessageSource getMessageSource() {
        return messageSource;
    }

    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public Point getCenter() {
        return center;
    }

    @Resource
    public void setCenter(Point center) {
        this.center = center;
    }

    @PostConstruct
    public void initializeCircle() {
        System.out.println("Init of Circle.. ");
    }

    @PreDestroy
    public void destroyCircle() {
        System.out.println("Destroy of Circle.. ");
    }

}
