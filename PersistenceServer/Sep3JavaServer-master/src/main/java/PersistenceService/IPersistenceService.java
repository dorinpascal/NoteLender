package PersistenceService;

import java.sql.SQLException;
import java.util.ArrayList;

public interface IPersistenceService {
     String getGroup(int id) throws SQLException;
     String postGroup(String json) throws SQLException;
     String deleteGroup(int id) throws SQLException;
     String getUserList(int id) throws SQLException;
     String getNote(int groupId) throws SQLException;
     String addNote(String json) throws SQLException;
     String editNote(String json) throws SQLException;
     String validateUser(String json) throws SQLException;
     String registerUser(String json) throws SQLException;
     String addInvitation(String json) throws  SQLException;
     String getInvitationList(String id) throws SQLException;
     String deleteInvitation(String id) throws SQLException;
     String editUser(String json, int user_id) throws SQLException;
     String deleteNote(int noteId);
     String deleteUser(int userId);
}
