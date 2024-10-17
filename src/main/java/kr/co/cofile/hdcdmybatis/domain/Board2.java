package kr.co.cofile.hdcdmybatis.domain;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
@ToString
@EqualsAndHashCode(of = { "title", "writer" })
public class Board2 {
	private int id;
	@NonNull
	private String title;
	@NonNull
	private String content;
	private String writer;

}