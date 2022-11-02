package kr.kwangan2.springmvcboard.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.kwangan2.springmvcboard.domain.BoardVO;
import kr.kwangan2.springmvcboard.domain.Criteria;
import kr.kwangan2.springmvcboard.mapper.BoardMapper;
import lombok.Setter;

@Service
public class BoardDAOImpl extends AbstractBoardDAO {
	
	@Setter(onMethod_= @Autowired)
	private BoardMapper mapper;
	
	@Override
	public List<BoardVO> boardVOList() {
		return mapper.boardVOList();
	}

	@Override
	public List<BoardVO> boardVOList(Criteria criteria) {
		return mapper.boardVOList(criteria);
	}

	@Override
	public int boardVOListCount(Criteria criteria) {
		return mapper.boardVOListCount(criteria);
	}
	
	@Override
	public int insertBoardVO(BoardVO boardVO) {
		return mapper.insertBoardVO(boardVO);
	}

	@Override
	public int insertBoardVOSelectKey(BoardVO boardVO) {
		return mapper.insertBoardVOSelectKey(boardVO);
	}

	@Override
	public BoardVO selectBoardVO(long bno) {
		return mapper.selectBoardVO(bno);
	}

	@Override
	public int deleteBoardVO(long bno) {
		return mapper.deleteBoardVO(bno);
	}

	@Override
	public int updateBoardVO(BoardVO boardVO) {
		return mapper.updateBoardVO(boardVO);
	}

}
