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
@RequestMapping("/hola_paises")
public class HolaPaisController {

    @RequestMapping(method = RequestMethod.GET)
    public String get() {
        return "Hola a todos los paises del mundo!";
    }

    @RequestMapping(method = RequestMethod.GET, params = {"pais"})
    public String getByPais(@RequestParam String pais) {
        return "Hola al pais de " + pais + "!";
    }
}

