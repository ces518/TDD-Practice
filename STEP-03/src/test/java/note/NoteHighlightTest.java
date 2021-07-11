package note;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class NoteHighlightTest {

	@Test
	void highlight_abc() {
//		abc -> abc
//		note -> {note}
//		1 note -> 1 {note}
//		1 note 2 -> 1 {note} 2
//		keynote -> keynote
//		ke1note -> ke1note
//		yes note1 -> yes note1
//		yes notea -> yes notea
//		no a note -> no a {note}
//		no a note anote-> no a {note} anote

		String highlightedAbc = highlight("abc");
		assertThat(highlightedAbc).isEqualTo("abc");
	}

	@Test
	void note_highlight() {
		String highlightedString = highlight("note");
		assertThat(highlightedString).isEqualTo("{note}");
	}

	@Test
	void one_note() {
		String highlightedString = highlight("1 note");
		assertThat(highlightedString).isEqualTo("1 {note}");
	}

	@Test
	void one_note_two() {
		String highlightedString = highlight("1 note 2");
		assertThat(highlightedString).isEqualTo("1 {note} 2");
	}

	@Test
	void keynote() {
		String highlightedString = highlight("keynote");
		assertThat(highlightedString).isEqualTo("keynote");
	}

	@Test
	void ke1note() {
		String highlightedString = highlight("ke1note");
		assertThat(highlightedString).isEqualTo("ke1note");
	}

	@Test
	void yes_note1() {
		String highlightedString = highlight("yes notea");
		assertThat(highlightedString).isEqualTo("yes notea");
	}

	@Test
	void yes_notea() {
		String highlightedString = highlight("yes note1");
		assertThat(highlightedString).isEqualTo("yes note1");
	}

	@Test
	void no_a_note() {
		String highlightedString = highlight("no a note");
		assertThat(highlightedString).isEqualTo("no a {note}");
	}

	@Test
	void no_a_note_note() {
		String highlightedString = highlight("no a note note");
		assertThat(highlightedString).isEqualTo("no a {note} {note}");
	}

	@Test
	void no_a_note_anote() {
		String highlightedString = highlight("no a note anote");
		assertThat(highlightedString).isEqualTo("no a {note} anote");
	}

	private String highlight(final String str) {
		String[] strings = str.split(" ");
		String returnValue = "";

		int idx = 0;
		for (String string : strings) {
			if (idx > 0) {
				returnValue += " ";
			}
			if (string.equals("note")) {
				string = string.replace("note", "{note}");
			}
			returnValue += string;
			idx++;
		}
		return returnValue;
	}
}
