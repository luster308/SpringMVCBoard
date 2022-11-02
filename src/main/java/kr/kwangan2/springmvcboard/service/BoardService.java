package kr.kwangan2.springmvcboard.service;

import java.util.List;

import kr.kwangan2.springmvcboard.domain.BoardVO;
import kr.kwangan2.springmvcboard.domain.Criteria;

public interface BoardService {
	
	public List<BoardVO> boardVOList();
	
	public List<BoardVO> boardVOList(Criteria criteria);
	
	public int boardVOListCount(Criteria criteria);
	   
	public int insertBoardVO(BoardVO boardVO);
	   
	public int insertBoardVOSelectKey(BoardVO boardVO);
	   
	public BoardVO selectBoardVO(long bno);
	   
	public int deleteBoardVO(long bno);
	   
	public int updateBoardVO(BoardVO boardVO);

}
