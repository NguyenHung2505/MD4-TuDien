package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TraCuuTuDien {
    @GetMapping("/db")
    public String db(){
        return "index";
    }

    @PostMapping ("/td")
    public String tudien(String tu , ModelMap modelMap){
        modelMap.put("tieng viet" , "VIETNAMSE");
        modelMap.put("qua cam" , "oringe");
        String result = (String) modelMap.get(tu);
        String ero = "";
        if ( result == null){
            ero = "khong tim thay";
        } else {
            modelMap.addAttribute("tu" , tu);
            modelMap.addAttribute("result" , result);
        }
        modelMap.addAttribute("ero",ero);
        return "index";
    }

}
