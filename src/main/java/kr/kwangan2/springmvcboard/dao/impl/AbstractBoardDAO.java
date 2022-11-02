package kr.kwangan2.springmvcboard.dao.impl;

import java.util.List;

import kr.kwangan2.springmvcboard.dao.BoardDAO;
import kr.kwangan2.springmvcboard.domain.BoardVO;
import kr.kwangan2.springmvcboard.domain.Criteria;

public class AbstractBoardDAO implements BoardDAO {

	@Override
	public List<BoardVO> boardVOList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BoardVO> boardVOList(Criteria criteria) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int boardVOListCount(Criteria criteria) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public int insertBoardVO(BoardVO boardVO) {
		return 0;
	}

	@Override
	public int insertBoardVOSelectKey(BoardVO boardVO) {
		return 0;
	}

	@Override
	public BoardVO selectBoardVO(long bno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteBoardVO(long bno) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateBoardVO(BoardVO boardVO) {
		// TODO Auto-generated method stub
		return 0;
	}

}
