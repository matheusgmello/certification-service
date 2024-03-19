package br.com.matheus.certification.modules.students.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.matheus.certification.modules.students.dto.StudentCertificationAnswerDTO;
import br.com.matheus.certification.modules.students.repositories.StudentRepository;

@Service
public class StudentCertificationAnswersUseCase {

    @Autowired
    private StudentRepository studentRepository;

    public void execute(StudentCertificationAnswerDTO dto) {
        // Verificar se usuário ele existe
        var student = studentRepository.findByEmail(dto.getEmail());

        if(student != null);

        // Buscar as alternativas das perguntas
        // - Correct ou Incorreta

        // Salvar as informações da certificação
    }
}