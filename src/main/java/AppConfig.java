import com.barefoot.repository.ProductRepository;
import com.barefoot.repository.ProductRepositoryImpl;
import com.barefoot.service.ProductService;
import com.barefoot.service.ProductServiceImpl;
import com.barefoot.util.CalendarFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Calendar;

@Configuration
@ComponentScan({"com.barefoot"})
public class AppConfig {

    /**
     * Create instance of calendar from factory Bean
     * @return calendar created from factory
     */
    @Bean(name="cal")
    public CalendarFactory calFactory(){
        CalendarFactory factory = new CalendarFactory();
        factory.addDays(2);
        return factory;
    }

    /**
     * Get instance of factoryBean
     * @return instance of calendar from factory bean
     * @throws Exception
     */
    @Bean
    public Calendar cal() throws Exception{
        return calFactory().getObject();
    }

//    @Bean(name = "productService")
//    @Scope(value= BeanDefinition.SCOPE_SINGLETON)
//    public ProductService getProductService(){
//        ProductServiceImpl service = new ProductServiceImpl();
//        //ProductServiceImpl service = new ProductServiceImpl(getProductRepository());
//        //service.setRepository(getProductRepository());
//        return service;
//    }

//    @Bean(name = "productRepository")
//    public ProductRepository getProductRepository(){
//        return new ProductRepositoryImpl();
//    }
}