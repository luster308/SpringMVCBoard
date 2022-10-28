package kr.kwangan2.springmvcboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kr.kwangan2.springmvcboard.domain.BoardVO;
import kr.kwangan2.springmvcboard.service.BoardService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/board/*")
@AllArgsConstructor
public class BoardController {
	
	private BoardService boardService;
	
	@GetMapping("/list")
	public void boardVOList(Model model) {
		log.info("list");
		model.addAttribute(boardService.boardVOList());
	}

	@GetMapping("/select")
	public void selectBoardVO(@RequestParam("bno") long bno, Model model) {
		
		log.info("/select");
		model.addAttribute("boardVO", boardService.selectBoardVO(bno));
	}
	
	@PostMapping("/update")
	public String updateBoardVO(BoardVO boardVO, RedirectAttributes rttr) {
		if(boardService.updateBoardVO(boardVO) > 0) {
			rttr.addFlashAttribute("result", "success");
		}
		return "redirect:/board/list";
	}
	
	@PostMapping("/delete")
	public String deleteBoardVO(@RequestParam("bno") long bno, RedirectAttributes rttr) {
		if(boardService.deleteBoardVO(bno) > 0) {
			rttr.addFlashAttribute("result", "sucess");
		}
		return "redirect:/board/list";
	}
	
	
	
	
	
	
	
}		//class
