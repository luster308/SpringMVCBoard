package kr.kwangan2.springmvcboard.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import kr.kwangan2.springmvcboard.domain.BoardVO;
import kr.kwangan2.springmvcboard.domain.Criteria;
import kr.kwangan2.springmvcboard.mapper.BoardMapper;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@WebAppConfiguration
@ContextConfiguration({
	"file:src/main/webapp/WEB-INF/spring/root-context.xml",
	"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
@Log4j
public class BoardMapperTests {
	
	@Setter(onMethod_ = @Autowired)
	private WebApplicationContext ctx;
	private MockMvc mockMvc;

	@Setter(onMethod_ = @Autowired)
	private BoardMapper mapper;

//   @Test
//   public void testGetList() {
//      mapper.boardVOList().forEach(board -> log.info(board));
//   }
//   
//   @Test
//   public void testBoardVOinsert() {
//	   BoardVO boardVO = new BoardVO();
//	   boardVO.setTitle("제목1");
//	   boardVO.setContent("내용1");
//	   boardVO.setWriter("작성자1");
//	   
//	   mapper.insertBoardVO(boardVO);
//	   
//	   log.info(boardVO);
//   }
//   
//   @Test
//   public void testBoardVOSelectKey() {
//	   BoardVO boardVO = new BoardVO();
//	   boardVO.setTitle("제목1");
//	   boardVO.setContent("내용1");
//	   boardVO.setWriter("작성자1");
//	   
//	   mapper.insertBoardVOSelectKey(boardVO);
//	   
//	   log.info(boardVO);
//   }
//   
//   @Test
//   public void testSelectBoardVO() {
//	   
//	   BoardVO boardVO = mapper.selectBoardVO(2L);
//	   
//	   log.info(boardVO);
//   }
//   
//   @Test
//   public void testDeleteBoardVO() {
//	   
//	   int result = mapper.deleteBoardVO(4L);
//	   
//	   log.info(result);
//   }
//
//   @Test
//   public void testUpdateBoardVO() {
//	   BoardVO boardVO = new BoardVO();
//	   boardVO.setBno(5L);
//	   boardVO.setTitle("제목 수정1");
//	   boardVO.setContent("내용 수정1");
//	   boardVO.setWriter("작성자 수정1");
//	   
//	   int result = mapper.updateBoardVO(boardVO);
//	   
//	   log.info(result);
//   }
//   
//   @Test
//   public void testPaging() {
//	   Criteria criteria = new Criteria();
//	   criteria.setPageNum(1);
//	   criteria.setAmount(10);
//	   List<BoardVO> list = mapper.boardVOList(criteria);
//	   list.forEach(boardVO -> log.info(boardVO));
//   }
	
	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
	}

	@Test
   public void testPaging() throws Exception{
	   log.info(
			   mockMvc.perform(
					 MockMvcRequestBuilders.get("/board/list")
					   		.param("pageNum", "1")
					   			.param("amount", "10"))
			   		.andReturn().getModelAndView().getModelMap()
			   );
   }

} // class