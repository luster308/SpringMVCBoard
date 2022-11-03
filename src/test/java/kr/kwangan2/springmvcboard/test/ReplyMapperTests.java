package kr.kwangan2.springmvcboard.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import kr.kwangan2.springmvcboard.domain.ReplyVO;
import kr.kwangan2.springmvcboard.service.ReplyService;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class ReplyMapperTests {
	
	@Setter(onMethod_ = @Autowired)
	private ReplyService replyService;
	
//	@Test
//	public void testListReplyVO() {
//		List<ReplyVO> list = replyService.listReplyVO();
//		assertNotNull(list);
//		log.info(list);
//	}
	
//	@Test
//	public void testReplyVOListCount() {
//		int result = replyService.replyVOListCount();
//		log.info(result);
//		assertTrue(result>0);
//	}
	
//	@Test
//	public void testSelectReplyVO() {
//		ReplyVO result = replyService.selectReplyVO(5L);
//		log.info(result);
//	}
	
//	@Test
//	public void testInsertReplyVO() {
//		ReplyVO replyVO = new ReplyVO();
//		replyVO.setBno(5);
//		replyVO.setReply("댓글입력");
//		replyVO.setReplyer("댓글입력");
//		int result = replyService.insertReplyVO(replyVO);
//		log.info(result);
//	}
	
//	@Test
//	public void testUpdateReplyVO() {
//		ReplyVO replyVO = new ReplyVO();
//		replyVO.setRno(1L);
//		replyVO.setReply("수정");
//		replyVO.setReplyer("수정");
//		int result = replyService.updateReplyVO(replyVO);
//		assertNotNull(result);
//		log.info(result);
//	}
	
//	@Test
//	public void testDeleteReplyVO() {
//		replyService.deleteReplyVO(7);
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}		// class
