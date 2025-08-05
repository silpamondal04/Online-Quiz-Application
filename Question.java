package com.quizserver.entities;

import com.quizserver.dto.QuestionDTO;
import com.quizserver.entities.Question;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String questionText;

    private String optionA;

    private String optionB;

    private String optionC;

    private String optionD;

    private String correctOption;


    @ManyToOne
    @JoinColumn(name ="test_id")
    private Test test;

    public void setTest(Test test) {
        this.test = test;
    }

    public Test getTest() {
        return this.test;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }

    public void setOptionC(String optionC) {
        this.optionC = optionC;
    }

    public void setOptionD(String optionD) {
        this.optionD = optionD;
    }

    public void setCorrectOption(String correctOption) {
        this.correctOption = correctOption;
    }

    public Long getId() {
        return id;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String getOptionA() {
        return optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public String getOptionC() {
        return optionC;
    }

    public String getOptionD() {
        return optionD;
    }

    public String getCorrectOption() {
        return correctOption;
    }

    public QuestionDTO getDTO(){
        QuestionDTO dto = new QuestionDTO();

        dto.setId(this.id);
        dto.setQuestionText(this.questionText);
        dto.setOptionA(this.optionA);
        dto.setOptionB(this.optionB);
        dto.setOptionC(this.optionC);
        dto.setOptionD(this.optionD);
        dto.setCorrectOption(this.correctOption);

        return dto;
    }
}
