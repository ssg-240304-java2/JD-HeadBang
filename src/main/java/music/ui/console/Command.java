package music.ui.console;

public enum Command {
    SHOW_ALBUM("1", "앨범 전체 출력"),
    SEARCH_ALBUM("2", "앨범 검색"),
    SEARCH_SONG("3", "노래 검색"),
    SEARCH_SINGER("4", "가수 검색"),
    ADD_ALBUM("5", "장바구니 담기"),
    SHOW_CART("6", "장바구니 보기"),
    UPDATE_CART("7", "앨범 개수 변경"),
    BUY_ALBUM("8", "구매하기"),
    EXIT("0", "종료하기")
    ;

    private final String code;
    private final String title;

    Command(String code, String title) {
        this.code = code;
        this.title = title;
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public static Command from(String code) {
        for (Command command : values()) {
            if (command.code.equals(code)) {
                return command;
            }
        }
        throw new IllegalArgumentException(code + " 명령어는 찾을 수 없습니다");
    }
}
