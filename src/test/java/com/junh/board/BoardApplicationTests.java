package com.junh.board;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.junh.board.answer.Answer;
import com.junh.board.answer.AnswerRepository;
import com.junh.board.question.Question;
import com.junh.board.question.QuestionRepository;
import com.junh.board.question.QuestionService;

@SpringBootTest
class BoardApplicationTests {

	@Autowired
	private QuestionRepository questionRepository;

	@Autowired
	private AnswerRepository answerRepository;

	@Autowired
	private QuestionService questionService;

	// @Test
	// void testJpa() {
	// 	Question q1 = new Question();
	// 	q1.setSubject("sbb가 무엇인가요?");
	// 	q1.setContent("sbb에 대해서 알고 싶습니다.");
	// 	q1.setCreateDate(LocalDateTime.now());
	// 	this.questionRepository.save(q1);

	// 	Question q2 = new Question();
	// 	q2.setSubject("스프링부트 모델 질문입니다.");
	// 	q2.setContent("id는 자동으로 생성되나요?");
	// 	q2.setCreateDate(LocalDateTime.now());
	// 	this.questionRepository.save(q2);
	// }

	// @Test
	// void testJpa1() {
	// 	List<Question> all = this.questionRepository.findAll();
	// 	assertEquals(2, all.size());

	// 	Question q = all.get(0);
	// 	assertEquals("sbb가 무엇인가요?", q.getSubject());
	// }

	// @Test
	// void testJpa2() {
	// 	Optional<Question> oq = this.questionRepository.findById(1);
	// 	if(oq.isPresent()) {
	// 		Question q = oq.get();
	// 		assertEquals("sbb가 무엇인가요?", q.getSubject());
	// 	}
	// }

	// @Test
	// void testJpa3() {
	// 	Question q = this.questionRepository.findBySubject("sbb가 무엇인가요?");
	// 	assertEquals(1, q.getId());
	// }

	// @Test
	// void testJps4() {
	// 	Question q = this.questionRepository.findBySubjectAndContent("sbb가 무엇인가요?", "sbb에 대해서 알고 싶습니다.");
	// 	assertEquals(1, q.getId());
	// }

	// @Test
	// void testJpa5() {
	// 	List<Question> qList = this.questionRepository.findBySubjectLike("sbb%");
	// 	Question q = qList.get(0);
	// 	assertEquals("sbb가 무엇인가요?", q.getSubject());
	// }

	// @Test
	// void testJpa6() {
	// 	Optional<Question> oq = this.questionRepository.findById(1);
	// 	assertTrue(oq.isPresent());
	// 	Question q = oq.get();
	// 	q.setSubject("수정된 제목");
	// 	this.questionRepository.save(q);
	// }

	// @Test
	// void testJpa7() {
	// 	assertEquals(2, this.questionRepository.count());
	// 	Optional<Question> oq = this.questionRepository.findById(1);
	// 	assertTrue(oq.isPresent());
	// 	Question q = oq.get();
	// 	this.questionRepository.delete(q);
	// 	assertEquals(1, this.questionRepository.count());
	// }

	// @Test
	// void testJpa8() {
	// 	Optional<Question> oq = this.questionRepository.findById(2);
	// 	assertTrue(oq.isPresent());
	// 	Question q = oq.get();

	// 	Answer a = new Answer();
	// 	a.setContent("네 자동으로 생성됩니다.");
	// 	a.setQuestion(q);
	// 	a.setCreateDate(LocalDateTime.now());
	// 	this.answerRepository.save(a);
	// }

	// @Test
	// void testJpa9() {
	// 	Optional<Answer> oa = this.answerRepository.findById(1);
	// 	assertTrue(oa.isPresent());
	// 	Answer a = oa.get();
	// 	assertEquals(2, a.getQuestion().getId());
	// }

	// @Transactional
	// @Test
	// void testJpa10() {
	// 	Optional<Question> oq = this.questionRepository.findById(2);
	// 	assertTrue(oq.isPresent());
	// 	Question q = oq.get();

	// 	List<Answer> answerList = q.getAnswerList();

	// 	assertEquals(1, answerList.size());
	// 	assertEquals("네 자동으로 생성됩니다.", answerList.get(0).getContent());
	// }

	// 게시판 페이징을 위해서 테스트 페이지 300여개 정도 생성
	@Test
	void testJpa11() {
		for(int i = 1; i <= 300; i++) {
			String subject = String.format("테스트 데이터 입니다 : [%03d]", i);
			String content = "내용무";
			this.questionService.create(subject, content, null);
		}
	}
}
