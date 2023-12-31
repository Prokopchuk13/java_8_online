package ua.com.alevel.service.music;
import ua.com.alevel.db.MusicDb;
import ua.com.alevel.entitys.Music;

public class MusicServiceImplementation implements MusicService{
    private final MusicDb repository;
    public MusicServiceImplementation(MusicDb musicDb) {
        repository = musicDb;
    }
    @Override
    public Music create(Music music) {
        Music result = repository.create(music);
        if (result.getAuthor() != null){
            System.out.println(result.getAuthor());
        }
        if (result.getName() != null) {
            System.out.println(result.getName());
        }
        if (result.getTime() != 0){
            System.out.println(result.getTime());
        }
        if (result.getAge() != 0){
            System.out.println(result.getAge());
        }
        System.out.println(result.getId());
        return null;
    }
    @Override
    public Music update(String id,Music music) {
        repository.update(id, music);
        Music result = repository.update(id,music);
        System.out.println(result.getAuthor());
        System.out.println(result.getName());
        System.out.println(result.getAge());
        System.out.println(result.getTime());
        return null;
    }

    @Override
    public Music delete(String id) {
        repository.delete(id);
        return null;
    }

    @Override
    public Music find(String id) {
        repository.find(id);
        Music music = repository.find(id);
        System.out.println(music.getAuthor());
        System.out.println(music.getName());
        System.out.println(music.getAge());
        System.out.println(music.getTime());
        return music;
    }
}

