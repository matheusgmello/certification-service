package br.com.matheus.certification.modules.students.entities;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnswersCertifcationsEntity {

  private UUID id;
  private UUID certificationID;
  private UUID studentID;
  private UUID questionID;
  private UUID answerID;
  private boolean isCorrect;

}
