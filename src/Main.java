public class Main {

    public static void main(String[] args) {
        System.out.println("Домашнее задание: ");
        Author aleksanderPyshkin = new Author("Александр", "Пушкин");
        Author mihailLermontov = new Author("Михаил", "Лермонтов");
        Book ruslanILudmila = new Book("Руслан и Людмила", aleksanderPyshkin, 2010);
        Book mciri = new Book("Мцыри", mihailLermontov, 2005);
        System.out.println("Книга: " + ruslanILudmila.getTitle() + ". Автор: " + ruslanILudmila.getAuthor().getName() + " " + ruslanILudmila.getAuthor().getSurname() + ". Год публикации: " +ruslanILudmila.getEditionsYear());
        System.out.println("Книга: " + mciri.getTitle() + ". Автор: " + mciri.getAuthor().getName() + " " + mciri.getAuthor().getSurname() + ". Год публикации: " + mciri.getEditionsYear());
        ruslanILudmila.setEditionsYear(2022);
        mciri.setEditionsYear(2021);
        System.out.println("Книга: " + ruslanILudmila.getTitle() + ". Автор: " + ruslanILudmila.getAuthor().getName() + " " + ruslanILudmila.getAuthor().getSurname() + ". Год публикации: " +ruslanILudmila.getEditionsYear());
        System.out.println("Книга: " + mciri.getTitle() + ". Автор: " + mciri.getAuthor().getName() + " " + mciri.getAuthor().getSurname() + ". Год публикации: " + mciri.getEditionsYear());
    }
}
