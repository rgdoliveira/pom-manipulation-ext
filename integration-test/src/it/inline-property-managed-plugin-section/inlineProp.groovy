/*
 * Copyright (C) 2022 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
import org.commonjava.maven.atlas.ident.ref.SimpleProjectRef
import org.commonjava.maven.ext.core.groovy.BaseScript
import org.commonjava.maven.ext.core.groovy.InvocationStage
import org.commonjava.maven.ext.core.groovy.PMEBaseScript
import org.commonjava.maven.ext.core.groovy.InvocationPoint

@InvocationPoint(invocationPoint = InvocationStage.FIRST)
@PMEBaseScript BaseScript pme


println "Altering project " + pme.getGAV()
pme.inlineProperty(pme.getProject(), SimpleProjectRef.parse("io.quarkus:quarkus-bootstrap-maven-plugin"))