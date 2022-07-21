package consumidor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SaludoControlador {
    @Autowired
    private SaludoServicio ss;

    @RequestMapping("/get-saludo/{nombre}")
    public String getGreeting(Model model, @PathVariable("nombre") String nombre) {
        model.addAttribute("saludar", ss.getSaludar(nombre));
        return "saludar-view";
    }
}
