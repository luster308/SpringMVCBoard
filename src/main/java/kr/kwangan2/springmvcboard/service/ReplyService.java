package kr.kwangan2.springmvcboard.service;

import java.util.List;

import kr.kwangan2.springmvcboard.domain.Criteria;
import kr.kwangan2.springmvcboard.domain.ReplyPageDTO;
import kr.kwangan2.springmvcboard.domain.ReplyVO;

public interface ReplyService {
	
	public ReplyPageDTO listReplyVO(Criteria criteria, long bno);
	
	public int replyVOListCount(long bno);
	
	public ReplyVO selectReplyVO(long rno);
	
	public int insertReplyVO(ReplyVO replyVO);
	
	public int updateReplyVO(ReplyVO replyVO);
	
	public int deleteReplyVO(long rno);

}
