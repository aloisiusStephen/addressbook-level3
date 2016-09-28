package seedu.addressbook.storage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.data.exception.IllegalValueException;
import seedu.addressbook.storage.StorageFile.InvalidStorageFilePathException;
import seedu.addressbook.storage.StorageFile.StorageOperationException;
import seedu.addressbook.storage.jaxb.AdaptedAddressBook;

public class StorageStub extends Storage {

    public final String path;
    
    public StorageStub(String filePath) {
       path = filePath;
    }

    @Override
    public void save(AddressBook addressBook) throws StorageOperationException {}

    @Override
    public AddressBook load() throws StorageOperationException {
        return new AddressBook();
    }

    @Override
    public String getPath() {
        return path;
    }
   


}
