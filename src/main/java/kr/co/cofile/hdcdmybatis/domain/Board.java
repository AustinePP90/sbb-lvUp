package kr.co.cofile.hdcdmybatis.domain;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
//@EqualsAndHashCode(of="id")
@EqualsAndHashCode(of={"title", "writer"})
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
//    @Builder.Default
    private String writer;
    private LocalDateTime createTime;

}
