package kr.kwangan2.springmvcboard.domain;

import java.util.Date;

import lombok.Data;

@Data
public class ReplyVO {

	private long rno;
	private long bno;
	private String reply;
	private String replyer;
	private Date replydate;
	private Date updatedate;
	
	public ReplyVO() {
		
	}

	public ReplyVO(Long bno, String reply, String replyer) {

		this.bno = bno;
		this.reply = reply;
		this.replyer = replyer;

	}

}