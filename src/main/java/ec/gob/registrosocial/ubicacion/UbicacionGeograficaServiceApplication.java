package ec.gob.registrosocial.ubicacion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class UbicacionGeograficaServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(UbicacionGeograficaServiceApplication.class, args);
  }
}
