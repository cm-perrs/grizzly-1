/*
 * Copyright (c) 2012, 2017 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package org.glassfish.grizzly.http;

import junit.framework.TestCase;

public class HttpRequestPacketTest extends TestCase {

    private HttpRequestPacket request;

    public void testToString() {
        request = HttpRequestPacket.builder()
                .uri("/")
                .protocol(Protocol.HTTP_1_1)
                .header("transfer-encoding", "chunked")
                .header("some-header", "firstValue")
                .header("some-header", "secondValue")
                .build();

        assertEquals(request.toString(), "HttpRequestPacket (\n"
                + "   method=GET\n"
                + "   url=/\n"
                + "   query=null\n"
                + "   protocol=HTTP/1.1\n"
                + "   content-length=-1\n"
                + "   headers=[\n"
                + "      transfer-encoding=chunked\n"
                + "      some-header=firstValue\n"
                + "      some-header=secondValue]\n"
                + ")");
    }

}
