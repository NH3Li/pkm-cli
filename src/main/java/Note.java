import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class Note {
    private Long id;
    private String title;
    private String content;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    // 体现关联关系：一个Note有多个Tag
    private Set<Tag> tags = new HashSet<>();

    // 构造方法
    public Note(String title, String content) {
        this.title = title;
        this.content = content;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }
    // Getter 和 Setter 方法 (所有属性)
    public void addTag(Tag tag) {
        this.tags.add(tag);
    }
    public void removeTag(Tag tag) {
        this.tags.remove(tag);
    }
    // 其他方法...
}