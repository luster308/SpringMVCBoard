package kr.kwangan2.springmvcboard.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.kwangan2.springmvcboard.domain.Criteria;
import kr.kwangan2.springmvcboard.domain.ReplyPageDTO;
import kr.kwangan2.springmvcboard.domain.ReplyVO;
import kr.kwangan2.springmvcboard.mapper.ReplyMapper;
import kr.kwangan2.springmvcboard.service.ReplyService;
import lombok.Setter;

@Service
public class ReplyDAOImpl implements ReplyService {
	
	@Setter(onMethod_ = @Autowired)
	private ReplyMapper replyMapper;

	@Override
	public ReplyPageDTO listReplyVO(Criteria criteria, long bno) {
		return 
				new ReplyPageDTO(
						replyMapper.replyVOListCount(bno), 
						replyMapper.listReplyVO(criteria, bno)
		);
	}

	@Override
	public int replyVOListCount(long bno) {
		return replyMapper.replyVOListCount(bno);
	}

	@Override
	public ReplyVO selectReplyVO(long rno) {
		return replyMapper.selectReplyVO(rno);
	}

	@Override
	public int insertReplyVO(ReplyVO replyVO) {
		return replyMapper.insertReplyVO(replyVO);
	}

	@Override
	public int updateReplyVO(ReplyVO replyVO) {
		return replyMapper.updateReplyVO(replyVO);
	}

	@Override
	public int deleteReplyVO(long rno) {
		return replyMapper.deleteReplyVO(rno);
	}


}
