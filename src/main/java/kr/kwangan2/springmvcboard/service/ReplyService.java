package kr.kwangan2.springmvcboard.service;

import java.util.List;

import kr.kwangan2.springmvcboard.domain.Criteria;
import kr.kwangan2.springmvcboard.domain.ReplyVO;

public interface ReplyService {
	
	public List<ReplyVO> listReplyVO(Criteria criteria, long bno);
	
	public int replyVOListCount();
	
	public ReplyVO selectReplyVO(long rno);
	
	public int insertReplyVO(ReplyVO replyVO);
	
	public int updateReplyVO(ReplyVO replyVO);
	
	public int deleteReplyVO(long rno);

}
