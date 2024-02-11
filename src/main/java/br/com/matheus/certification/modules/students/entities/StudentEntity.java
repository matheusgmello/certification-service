package br.com.matheus.certification.modules.students.entities;

import java.util.List;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentEntity {
  
  private UUID id;
  private String emal;
  private List<CertificationStudentEntity> certificationStudentEntity;
}
