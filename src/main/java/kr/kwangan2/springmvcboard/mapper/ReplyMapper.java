package kr.kwangan2.springmvcboard.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import kr.kwangan2.springmvcboard.domain.Criteria;
import kr.kwangan2.springmvcboard.domain.ReplyPageDTO;
import kr.kwangan2.springmvcboard.domain.ReplyVO;

public interface ReplyMapper {
	
	public List<ReplyVO> listReplyVO(
				@Param("criteria") Criteria criteria,
				@Param("bno") long bno
			);
	
	public int replyVOListCount(long bno);
	
	public ReplyVO selectReplyVO(long rno);
	
	public int insertReplyVO(ReplyVO replyVO);
	
	public int updateReplyVO(ReplyVO replyVO);
	
	public int deleteReplyVO(long rno);

}
