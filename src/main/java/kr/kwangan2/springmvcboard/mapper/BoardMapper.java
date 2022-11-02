package kr.kwangan2.springmvcboard.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import kr.kwangan2.springmvcboard.domain.BoardVO;
import kr.kwangan2.springmvcboard.domain.Criteria;

public interface BoardMapper {
   
   //@Select(" SELECT * FROM board WHERE bno>0 ")
   public List<BoardVO> boardVOList();
   
   public List<BoardVO> boardVOList(Criteria criteria);
   
   public int boardVOListCount(Criteria criteria);
   
   public int insertBoardVO(BoardVO boardVO);
   
   public int insertBoardVOSelectKey(BoardVO boardVO);
   
   public BoardVO selectBoardVO(long bno);
   
   public int deleteBoardVO(long bno);
   
   public int updateBoardVO(BoardVO boardVO);
      
}