package kr.kwangan2.springmvcboard.service;

import java.util.List;

import kr.kwangan2.springmvcboard.domain.BoardVO;

public interface BoardService {
	
	public List<BoardVO> boardVOList();
	   
	public void insertBoardVO(BoardVO boardVO);
	   
	public void insertBoardVOSelectKey(BoardVO boardVO);
	   
	public BoardVO selectBoardVO(long bno);
	   
	public int deleteBoardVO(long bno);
	   
	public int updateBoardVO(BoardVO boardVO);

}
