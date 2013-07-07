package com.whiuk.philip.mmorpg.server.chat;

public class ChannelPriveleges {
    private boolean readPrivilege;
    private boolean writePrivilege;
    private boolean talkPrivilege;
    private boolean mutePrivelege;
    private boolean stopWritePrivelege;
    private boolean kickPrivilege;
    private boolean banPrivilege;
    
    /**
     * Get privilege mask.
     * @return
     */
    public boolean[] getPrivilegeMask() {
        return new boolean[]{
            readPrivilege, writePrivilege, 
            talkPrivilege, mutePrivelege, 
            stopWritePrivelege, kickPrivilege, 
            banPrivilege
        };
    }
    
    /**
     * Set privileges using mask.
     * @param newPrivileges
     */
    public void setPrivilegeMask(boolean[] newPrivileges) {
        readPrivilege = newPrivileges[0];
        writePrivilege = newPrivileges[1];
        talkPrivilege = newPrivileges[2];
        mutePrivelege = newPrivileges[3];
        stopWritePrivelege = newPrivileges[4];
        kickPrivilege = newPrivileges[5];
        banPrivilege = newPrivileges[6];
    }
}
