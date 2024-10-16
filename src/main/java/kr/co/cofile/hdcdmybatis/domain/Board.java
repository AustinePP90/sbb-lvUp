package kr.co.cofile.hdcdmybatis.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.*;

@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = { "title", "writer" })
@ToString(exclude = "content")
public class Board implements Serializable {
	private static final long serialVersionID = 1L;

	private int id;
	@NonNull
	private String title;
	@NonNull
	private String content;
	@NonNull
	private String writer;
	private LocalDateTime createTime;

}
