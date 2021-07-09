package com.pool.modal;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Programming implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer progId;
	private String progQuestion;

	public Programming() {

	}

	public Integer getProgId() {
		return progId;
	}

	public Programming setProgId(Integer progId) {
		this.progId = progId;
		return this;
	}

	public String getProgQuestion() {
		return progQuestion;
	}

	public Programming setProgQuestion(String progQuestion) {
		this.progQuestion = progQuestion;
		return this;
	}

}
