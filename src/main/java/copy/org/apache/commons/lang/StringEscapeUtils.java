package copy.org.apache.commons.lang;

/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */



import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;


import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;


/**
 * <p>Escapes and unescapes <code>String</code>s for
 * Java, Java Script, HTML, XML, and SQL.</p>
 *
 * @author Apache Jakarta Turbine
 * @author Purple Technology
 * @author <a href="mailto:alex@purpletech.com">Alexander Day Chaffee</a>
 * @author Antony Riley
 * @author Helge Tesgaard
 * @author <a href="sean@boohai.com">Sean Brown</a>
 * @author <a href="mailto:ggregory@seagullsw.com">Gary Gregory</a>
 * @author Phil Steitz
 * @author Pete Gieser
 * @since 2.0
 * @version $Id: StringEscapeUtils.java 612880 2008-01-17 17:34:43Z ggregory $
 */
public class StringEscapeUtils {

    /**
     * <p><code>StringEscapeUtils</code> instances should NOT be constructed in
     * standard programming.</p>
     *
     * <p>Instead, the class should be used as:
     * <pre>StringEscapeUtils.escapeJava("foo");</pre></p>
     *
     * <p>This constructor is public to permit tools that require a JavaBean
     * instance to operate.</p>
     */
    public StringEscapeUtils() {
        super();
    }


    //-----------------------------------------------------------------------
    /**
     * <p>Escapes the characters in a <code>String</code> using XML entities.</p>
     *
     * <p>For example: <tt>"bread" & "butter"</tt> =>
     * <tt>&amp;quot;bread&amp;quot; &amp;amp; &amp;quot;butter&amp;quot;</tt>.
     * </p>
     *
     * <p>Supports only the five basic XML entities (gt, lt, quot, amp, apos).
     * Does not support DTDs or external entities.</p>
     *
     * <p>Note that unicode characters greater than 0x7f are currently escaped to
     *    their numerical \\u equivalent. This may change in future releases. </p>
     *
     * @param writer  the writer receiving the unescaped string, not null
     * @param str  the <code>String</code> to escape, may be null
     * @throws IllegalArgumentException if the writer is null
     * @throws IOException if there is a problem writing
     */
    public static void escapeXml(Writer writer, String str) throws IOException {
        if (writer == null ) {
            throw new IllegalArgumentException ("The Writer must not be null.");
        }
        if (str == null) {
            return;
        }
        copy.org.apache.commons.lang.Entities.XML.escape(writer, str);
    }

    /**
     * <p>Escapes the characters in a <code>String</code> using XML entities.</p>
     *
     * <p>For example: <tt>"bread" & "butter"</tt> =>
     * <tt>&amp;quot;bread&amp;quot; &amp;amp; &amp;quot;butter&amp;quot;</tt>.
     * </p>
     *
     * <p>Supports only the five basic XML entities (gt, lt, quot, amp, apos).
     * Does not support DTDs or external entities.</p>
     *
     * <p>Note that unicode characters greater than 0x7f are currently escaped to
     *    their numerical \\u equivalent. This may change in future releases. </p>
     *
     * @param str  the <code>String</code> to escape, may be null
     * @return a new escaped <code>String</code>, <code>null</code> if null string input
     */
    public static String escapeXml(String str) {
        if (str == null) {
            return null;
        }
        return copy.org.apache.commons.lang.Entities.XML.escape(str);
    }
}
