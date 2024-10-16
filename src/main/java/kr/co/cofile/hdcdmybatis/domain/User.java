package kr.co.cofile.hdcdmybatis.domain;

import java.io.Serial;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@RequiredArgsConstructor // @NonNull로 매개변수 지정
@AllArgsConstructor
@Builder
@Getter
@Setter
@EqualsAndHashCode(of = { "usrname", "psw" })
@ToString
public class User {
	@Serial
	private static final long serialVersionID = 1L;

	private int id;
	@NonNull
	private String usrname;
	@NonNull
	private String psw;
	private LocalDateTime createdTime;
}
