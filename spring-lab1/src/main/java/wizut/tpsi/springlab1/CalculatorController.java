package wizut.tpsi.springlab1;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class CalculatorController {

    @RequestMapping("/calculator")
    public String calculator(Model model, CalculatorForm calculatorForm) {

        model.addAttribute("x", calculatorForm.getX());
        model.addAttribute("y", calculatorForm.getY());
        model.addAttribute("sign", calculatorForm.getSign());
        Integer wynik = 0;

        switch (calculatorForm.getSign()) {
            case "+":
                wynik = calculatorForm.getX() + calculatorForm.getY();
                break;
            case "-":
                wynik = calculatorForm.getX() - calculatorForm.getY();
                break;
            case "*":
                wynik = calculatorForm.getX() * calculatorForm.getY();
                break;
            case "/":
                wynik = calculatorForm.getX() / calculatorForm.getY();
                break;
            default:

        }
        model.addAttribute("wynik", wynik);

        return "hello";
    }





}
