package fr.wildcodeschool.ImTheDoctor.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorController {

    @GetMapping("/doctor/1")
    @ResponseBody
    public String doc1() {  return " <H1> William Hartnell </H1> <BR> <a href=\"/\">Back</a> "; }

    @GetMapping("/doctor/2")
    @ResponseBody
    public String doc2() {  return " <H1> David Tennant </H1> <BR> <a href=\"/\">Back</a> "; }

    @GetMapping("/doctor/3")
    @ResponseBody
    public String doc3() {  return " <H1> Jodie Whittaker </H1> <BR> <a href=\"/\">Back</a> "; }

}
