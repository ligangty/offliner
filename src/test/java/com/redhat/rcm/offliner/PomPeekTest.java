package com.redhat.rcm.offliner;

import org.commonjava.maven.atlas.ident.ref.ProjectVersionRef;
import org.junit.Test;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.Set;

/**
 * Created by gli on 4/7/16.
 */
public class PomPeekTest {
    @Test
    public void test() {
        URL fileUrl = this.getClass().getResource("/repo.pom");
        PomPeek peek = new PomPeek(new File(fileUrl.getFile()));
        Set<String> modules = peek.getModules();
        ProjectVersionRef keyRef = peek.getKey().asProjectVersionRef();
        System.out.println(keyRef.toString());
        keyRef.getVersionSpec();
    }
}
