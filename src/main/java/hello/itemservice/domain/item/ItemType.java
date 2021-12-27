package hello.itemservice.domain.item;

public enum ItemType {
    Book("도서"), Food("음식"), ETC("기타");

    public String getDescription() {
        return description;
    }

    private  final String description;

    ItemType(String description) {
        this.description = description;
    }
}
