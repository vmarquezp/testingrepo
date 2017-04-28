package HolaMundo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Ariel Romero
 */
@RestController
@RequestMapping("/hola_continentes")
public class HolaContinenteController {

    @RequestMapping(method = RequestMethod.GET)
    public String get() {
        return "Hola a todos los continentes del mundo!";
    }

    @RequestMapping(method = RequestMethod.GET, params = {"continente"})
    public String getByContinente(@RequestParam String continente) {
        return "Hola al continente de " + continente + "!";
    }
}
