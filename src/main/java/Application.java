import com.barefoot.service.ProductService;
import com.barefoot.service.ProductServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String [] args)
    {
        ApplicationContext appContext = new AnnotationConfigApplicationContext( AppConfig.class);

        //ProductService serv = new ProductServiceImpl();

        ProductService serv = appContext.getBean("productService", ProductService.class);
//
//        System.out.println(serv);

        System.out.println(serv.findAll().get(0).getName());
        System.out.println(serv.findAll().get(0).getSeedNum());

//        ProductService serv2 = appContext.getBean("productService", ProductService.class);
//
//        System.out.println(serv2);


    }
}