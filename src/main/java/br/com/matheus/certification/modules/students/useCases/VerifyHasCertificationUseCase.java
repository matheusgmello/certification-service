package br.com.matheus.certification.modules.students.useCases;

import org.springframework.stereotype.Service;

import br.com.matheus.certification.modules.students.dto.VerifyHasCertificationDTO;

@Service
public class VerifyHasCertificationUseCase {
  
  public boolean execute( VerifyHasCertificationDTO dto ) {
    if(dto.getEmail().equals("matheus@gmail.com") && dto.getTechnology().equals("JAVA")){
      return true;
    }
    return false;
  }
}
