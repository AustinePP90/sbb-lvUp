package kr.co.cofile.hdcdmybatis.domain;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.*;

@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@EqualsAndHashCode(of = { "title", "writer" })
@ToString(exclude = "content")
public class Board implements Serializable {
	@Serial
	private static final long serialVersionUID = 1L;

	private int id;
	@NonNull
	private String title;
	@NonNull
	private String content;
	@NonNull
	private String writer;
	private LocalDateTime createTime;

}
