package music.domain;

import DTO.AlbumDTO;
import music.ui.console.utils.InputUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// TODO: 카트 DB 저장소가 필요?
public class Cart {
    private Long id;
    private final Map<AlbumDTO, Long> albums = new HashMap<>();

    public void put(List<AlbumDTO> albums) {
        albums.forEach(album -> {
            if(this.albums.containsKey(album)) this.albums.put(album, this.albums.get(album) + 1);
            else this.albums.put(album, 1L);
        });
    }

    public void show() {
        ArrayList<AlbumDTO> keys = new ArrayList<>(albums.keySet());
        for (int i = 0 ; i < keys.size() ; i++) {
            System.out.println((i + 1) + ". " + albums.get(keys.get(i)));
        }
    }

    public void update() {
        ArrayList<AlbumDTO> keys = new ArrayList<>(albums.keySet());
        show();
        int albumNo = Integer.parseInt(InputUtils.nextLine("변경하고자 하는 앨범의 번호를 입력하세요. "));
        Long albumCnt = Long.parseLong(InputUtils.nextLine("변경하고자 하는 개수를 입력하세요."));
        albums.put(keys.get((int) (albumNo - 1)), albumCnt);
    }
}
