package consumidor;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SaludoServicio {

    @HystrixCommand(fallbackMethod = "saludoPorDefecto")
    public String getSaludar(String nombre) {
        return new RestTemplate().getForObject("http://localhost:9090/saludo/{nombre}", String.class, nombre);
    }

    private String saludoPorDefecto(String nombre) {
        return "Hola usuario";
    }
	
}
