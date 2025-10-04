public class Tag {
    private Long id;
    private String name;
    // 构造方法、Getter和Setter省略...
    public Tag(long id, String name) {
        this.id = id;
        this.name = name;
    }
    void add(Tag tag){
        this.id=tag.id;
        this.name=tag.name;
    }
    void remove(Tag tag){
        this.id=tag.id;
    }
}