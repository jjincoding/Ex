package calculator.ch11;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class ListenerExam implements ServletContextListener, ServletContextAttributeListener, HttpSessionListener, HttpSessionAttributeListener {

    public ListenerExam() {
    }

    public void sessionCreated(HttpSessionEvent se)  {
    	se.getSession().getServletContext().log("Session 생성 완료 :" + se.getSession().getId());
    }

    public void attributeAdded(ServletContextAttributeEvent event)  { 
    	event.getServletContext().log("ServletContext 속성 추가 : " + event.getValue());
    }

    public void attributeRemoved(ServletContextAttributeEvent event)  { 
    }

    public void sessionDestroyed(HttpSessionEvent se)  { 
    }

    public void contextDestroyed(ServletContextEvent sce)  { 
    	sce.getServletContext().log("ServletContext 종료 !");
    }

    public void attributeAdded(HttpSessionBindingEvent event)  { 
    	event.getSession().getServletContext().log("Session 속성 추가 : " + event.getValue());
    }

    public void attributeRemoved(HttpSessionBindingEvent event)  { 
    }

    public void attributeReplaced(HttpSessionBindingEvent event)  { 
    }

    public void attributeReplaced(ServletContextAttributeEvent event)  { 
    }

    public void contextInitialized(ServletContextEvent sce)  { 
    	sce.getServletContext().log("ServletContext 시작 !");
    }
}
