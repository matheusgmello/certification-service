package br.com.matheus.certification.modules.students.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.matheus.certification.modules.students.dto.VerifyHasCertificationDTO;
import br.com.matheus.certification.modules.students.useCases.VerifyHasCertificationUseCase;

@RestController
@RequestMapping("/students")
public class StudentController {

  @Autowired
  private VerifyHasCertificationUseCase verifyHasCertificationUseCase;
  
  @PostMapping("/verifyIfHasCertification")
  public String verifyIfHasCertification(@RequestBody VerifyHasCertificationDTO verifyHasCertificationDTO) {

    var result = this.verifyHasCertificationUseCase.execute(verifyHasCertificationDTO);
    if(result){
      return "Usuário já fez a avaliação";
    }
    return "Usuário pode fazer a avaliação";
  }

}
