package br.com.lab365.ecommercejava.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@Data
@Entity
public class Cliente implements List<Cliente> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(nullable = false)
    private String nome;

    @Column(length = 18, nullable = false)
    private String documento;

    @Column(length = 100,nullable = false )
    private String email;

    @Column(length = 16, nullable = false )
    private String telefone;

    @Column(length = 10, nullable = false )
    private String cep;

    @Column(length = 120, nullable = false )
    private String logradouro;

    @Column(nullable = false )
    private Integer numero;

    @Column(length = 20)
    private String complemento;

    @Column(length = 30, nullable = false )
    private String bairro;

    @Column(length = 50, nullable = false )
    private String cidade;

    @Column(columnDefinition = "char", length = 2, nullable = false )
    private String uf;


    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Cliente> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Cliente cliente) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Cliente> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Cliente> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Cliente get(int index) {
        return null;
    }

    @Override
    public Cliente set(int index, Cliente element) {
        return null;
    }

    @Override
    public void add(int index, Cliente element) {

    }

    @Override
    public Cliente remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Cliente> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Cliente> listIterator(int index) {
        return null;
    }

    @Override
    public List<Cliente> subList(int fromIndex, int toIndex) {
        return null;
    }
}
