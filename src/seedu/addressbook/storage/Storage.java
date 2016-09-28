package seedu.addressbook.storage;

import java.nio.file.Path;
import java.nio.file.Paths;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.storage.StorageFile.InvalidStorageFilePathException;
import seedu.addressbook.storage.StorageFile.StorageOperationException;
import seedu.addressbook.storage.jaxb.AdaptedAddressBook;

public abstract class Storage {
 
   
    /**
     * Saves all data to this storage file.
     *
     * @throws StorageOperationException if there were errors converting and/or storing data to file.
     */
    public abstract void save(AddressBook addressBook) throws StorageOperationException;

    /**
     * Loads data from this storage file.
     *
     * @throws StorageOperationException if there were errors reading and/or converting data from file.
     */
    public abstract AddressBook load() throws StorageOperationException;
 
    /**
     * @return Storage file path
     */
    public abstract String getPath();
}
